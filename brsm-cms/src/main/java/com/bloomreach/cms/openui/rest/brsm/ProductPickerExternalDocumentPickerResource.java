package com.bloomreach.cms.openui.rest.brsm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.hippoecm.hst.site.HstServices;
import org.onehippo.cms7.crisp.api.broker.ResourceServiceBroker;
import org.onehippo.cms7.crisp.api.resource.Resource;
import org.onehippo.cms7.crisp.api.resource.ResourceBeanMapper;
import org.onehippo.cms7.crisp.api.resource.ResourceCollection;
import org.onehippo.cms7.crisp.hst.module.CrispHstServices;
import org.onehippo.cms7.essentials.components.rest.BaseRestResource;

import com.bloomreach.cms.openui.rest.ExternalDocumentPickerResource;
import com.bloomreach.cms.openui.rest.PickerItem;
import com.bloomreach.cms.openui.rest.brsm.model.PickerProductItem;


@Path("/productPicker")
public class ProductPickerExternalDocumentPickerResource extends BaseRestResource implements ExternalDocumentPickerResource {

    @GET
    @Path("/search")
    @Produces({MediaType.APPLICATION_JSON})
    public List<PickerItem> search(@QueryParam("query") String query,
                                   @QueryParam("page") @DefaultValue("1") int page,
                                   @QueryParam("pageSize") @DefaultValue("20") int pageSize,
                                   @QueryParam("documentLocale") String locale,
                                   @QueryParam("documentId") String documentId){
        final Map<String, Object> pathVars = new HashMap<>();

        int limit = pageSize;
        int offset = getOffset(page, pageSize);

        pathVars.put("q", query);
        pathVars.put("limit", limit);
        pathVars.put("offset", offset);

        ResourceServiceBroker broker = CrispHstServices.getDefaultResourceServiceBroker(HstServices.getComponentManager());
        Resource content = broker.resolve("productPicker", "&q={q}&rows={limit}&start={offset}", pathVars);
        Resource results = (Resource)content.getValue("response/docs");

        ResourceCollection children = results.getChildren();
        ResourceBeanMapper productPicker = broker.getResourceBeanMapper("productPicker");

        return productPicker.mapCollection(children, PickerProductItem.class)
                .stream().map(productItem -> new ProductPickerItemAdapter(productItem))
                .collect(Collectors.toList());

    }

    public int getOffset(int pageNumber, int pageSize) {
        int start = (pageNumber - 1) * pageSize;
        return start;
    }

}
