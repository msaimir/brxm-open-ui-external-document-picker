package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;

import com.bloomreach.site.openui.rest.formio.beans.FormIOCompound;

/**
 * TODO: Beanwriter: Failed to create getter for node type: formiopicker:formio
 */
@HippoEssentialsGenerated(internalName = "myproject:formdocument")
@Node(jcrType = "myproject:formdocument")
public class Formdocument extends BaseDocument {

    @HippoEssentialsGenerated(internalName = "myproject:title")
    public String getTitle() {
        return getSingleProperty("myproject:title");
    }

    public String getFormPath() {
        return getBean("myproject:formio", FormIOCompound.class).getPath();
    }
}
