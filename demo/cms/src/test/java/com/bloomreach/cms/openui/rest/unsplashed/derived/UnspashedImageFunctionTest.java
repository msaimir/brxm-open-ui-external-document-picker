package com.bloomreach.cms.openui.rest.unsplashed.derived;

import java.io.IOException;
import java.util.List;

import com.bloomreach.cms.openui.rest.unsplashed.UnsplashedPickerItemAdapter;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

public class UnspashedImageFunctionTest {

    @Test
    public void testObjectMapper() throws IOException {

        ObjectMapper MAPPER = new ObjectMapper();

        String openuidString = "[{\"id\":\"KMn4VEeEPR8\",\"description\":null,\"title\":\"seashore during golden hour\",\"data\":{\"id\":\"KMn4VEeEPR8\",\"created_at\":\"2017-10-09T01:04:47-04:00\",\"updated_at\":\"2019-07-21T01:04:40-04:00\",\"width\":4621,\"height\":3072,\"color\":\"#4D4837\",\"description\":\"The last night of a two week stay on the North Shore of Oahu, Hawaii.\",\"alt_description\":\"seashore during golden hour\",\"urls\":{\"raw\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"full\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"regular\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"small\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"thumb\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},\"links\":{\"self\":\"https://api.unsplash.com/photos/KMn4VEeEPR8\",\"html\":\"https://unsplash.com/photos/KMn4VEeEPR8\",\"download\":\"https://unsplash.com/photos/KMn4VEeEPR8/download\",\"download_location\":\"https://api.unsplash.com/photos/KMn4VEeEPR8/download\"},\"tags\":[{\"title\":\"beach\"},{\"title\":\"sea\"},{\"title\":\"ocean\"},{\"title\":\"nature\"},{\"title\":\"water\"},{\"title\":\"travel\"},{\"title\":\"coast\"},{\"title\":\"outdoors\"},{\"title\":\"waialua\"},{\"title\":\"north shore\"},{\"title\":\"united states\"},{\"title\":\"background\"},{\"title\":\"hawaii\"},{\"title\":\"landscape\"},{\"title\":\"wallpaper\"},{\"title\":\"website\"},{\"title\":\"shoreline\"},{\"title\":\"yellow\"},{\"title\":\"waves\"},{\"title\":\"foam\"}]},\"image\":\"https://images.unsplash.com/photo-1507525428034-b723cf961d3e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},{\"id\":\"BpYYsloFzTY\",\"description\":null,\"title\":null,\"data\":{\"id\":\"BpYYsloFzTY\",\"created_at\":\"2019-07-05T11:02:55-04:00\",\"updated_at\":\"2019-07-06T15:05:42-04:00\",\"width\":4000,\"height\":6000,\"color\":\"#E1DAD0\",\"description\":null,\"alt_description\":\"gray turtle near pond surrounded with grasses\",\"urls\":{\"raw\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"full\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"regular\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"small\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"thumb\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},\"links\":{\"self\":\"https://api.unsplash.com/photos/BpYYsloFzTY\",\"html\":\"https://unsplash.com/photos/BpYYsloFzTY\",\"download\":\"https://unsplash.com/photos/BpYYsloFzTY/download\",\"download_location\":\"https://api.unsplash.com/photos/BpYYsloFzTY/download\"},\"tags\":[{\"title\":\"outdoors\"},{\"title\":\"turtle\"},{\"title\":\"sea life\"},{\"title\":\"reptile\"},{\"title\":\"animal\"},{\"title\":\"water\"},{\"title\":\"nature\"},{\"title\":\"land\"},{\"title\":\"waterfowl\"},{\"title\":\"bird\"},{\"title\":\"pond\"},{\"title\":\"marsh\"},{\"title\":\"bog\"},{\"title\":\"swamp\"},{\"title\":\"teal\"},{\"title\":\"stork\"},{\"title\":\"crocodile\"},{\"title\":\"alligator\"},{\"title\":\"mallard\"},{\"title\":\"duck\"}]},\"image\":\"https://images.unsplash.com/photo-1562338962-03e01ece6908?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},{\"id\":\"d0qt3L9LBvc\",\"description\":null,\"title\":null,\"data\":{\"id\":\"d0qt3L9LBvc\",\"created_at\":\"2019-07-14T19:53:43-04:00\",\"updated_at\":\"2019-07-17T15:05:35-04:00\",\"width\":6000,\"height\":4000,\"color\":\"#9AE3ED\",\"description\":null,\"alt_description\":\"close-up photography of body of water\",\"urls\":{\"raw\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"full\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"regular\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"small\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"thumb\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},\"links\":{\"self\":\"https://api.unsplash.com/photos/d0qt3L9LBvc\",\"html\":\"https://unsplash.com/photos/d0qt3L9LBvc\",\"download\":\"https://unsplash.com/photos/d0qt3L9LBvc/download\",\"download_location\":\"https://api.unsplash.com/photos/d0qt3L9LBvc/download\"},\"tags\":[{\"title\":\"water\"},{\"title\":\"outdoors\"},{\"title\":\"nature\"},{\"title\":\"ripple\"},{\"title\":\"rock\"},{\"title\":\"sea\"},{\"title\":\"ocean\"},{\"title\":\"aquatic\"},{\"title\":\"animal\"},{\"title\":\"mammal\"},{\"title\":\"stones\"},{\"title\":\"flow\"},{\"title\":\"land\"},{\"title\":\"river\"},{\"title\":\"sand\"},{\"title\":\"sea life\"},{\"title\":\"shoreline\"},{\"title\":\"beach\"},{\"title\":\"coast\"},{\"title\":\"mountain\"}]},\"image\":\"https://images.unsplash.com/photo-1563148336-bc0c3296dc87?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},{\"id\":\"XEURsvdKXtE\",\"description\":null,\"title\":\"silhouette of person under cloudy sky during daytim\",\"data\":{\"id\":\"XEURsvdKXtE\",\"created_at\":\"2019-07-07T11:56:46-04:00\",\"updated_at\":\"2019-07-13T15:02:17-04:00\",\"width\":5184,\"height\":3456,\"color\":\"#FDFCFC\",\"description\":\"Seaside Moonscape\",\"alt_description\":\"silhouette of person under cloudy sky during daytim\",\"urls\":{\"raw\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"full\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"regular\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"small\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"thumb\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},\"links\":{\"self\":\"https://api.unsplash.com/photos/XEURsvdKXtE\",\"html\":\"https://unsplash.com/photos/XEURsvdKXtE\",\"download\":\"https://unsplash.com/photos/XEURsvdKXtE/download\",\"download_location\":\"https://api.unsplash.com/photos/XEURsvdKXtE/download\"},\"tags\":[{\"title\":\"human\"},{\"title\":\"person\"},{\"title\":\"nature\"},{\"title\":\"outdoors\"},{\"title\":\"animal\"},{\"title\":\"mammal\"},{\"title\":\"plant\"},{\"title\":\"herd\"},{\"title\":\"ground\"},{\"title\":\"water\"},{\"title\":\"river\"},{\"title\":\"sky\"},{\"title\":\"flare\"},{\"title\":\"light\"},{\"title\":\"mud\"},{\"title\":\"sea\"},{\"title\":\"ocean\"},{\"title\":\"wildlife\"},{\"title\":\"soil\"},{\"title\":\"landscape\"}]},\"image\":\"https://images.unsplash.com/photo-1562514958-8e9fdb384c72?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},{\"id\":\"ViNS4X3sBoU\",\"description\":null,\"title\":\"hippopotamus mascot riding red car toy beside the street\",\"data\":{\"id\":\"ViNS4X3sBoU\",\"created_at\":\"2017-10-25T13:10:15-04:00\",\"updated_at\":\"2019-06-14T01:11:47-04:00\",\"width\":4896,\"height\":3264,\"color\":\"#F4F5F5\",\"description\":\"Hyppo Car\",\"alt_description\":\"hippopotamus mascot riding red car toy beside the street\",\"urls\":{\"raw\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"full\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"regular\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"small\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\",\"thumb\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"},\"links\":{\"self\":\"https://api.unsplash.com/photos/ViNS4X3sBoU\",\"html\":\"https://unsplash.com/photos/ViNS4X3sBoU\",\"download\":\"https://unsplash.com/photos/ViNS4X3sBoU/download\",\"download_location\":\"https://api.unsplash.com/photos/ViNS4X3sBoU/download\"},\"tags\":[{\"title\":\"car\"},{\"title\":\"automobile\"},{\"title\":\"vehicle\"},{\"title\":\"transportation\"},{\"title\":\"netherlands\"},{\"title\":\"tilburg\"},{\"title\":\"street\"},{\"title\":\"building\"},{\"title\":\"scale\"},{\"title\":\"pedestrian\"},{\"title\":\"human\"},{\"title\":\"person\"},{\"title\":\"toy\"},{\"title\":\"old\"},{\"title\":\"path\"},{\"title\":\"pavement\"},{\"title\":\"urban\"},{\"title\":\"city\"},{\"title\":\"town\"},{\"title\":\"road\"}]},\"image\":\"https://images.unsplash.com/photo-1508951381092-7b753dc71d95?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjgwNjg5fQ\"}]";

        List<UnsplashedPickerItemAdapter > items = MAPPER.readValue(openuidString, MAPPER.getTypeFactory().constructCollectionType(List.class, UnsplashedPickerItemAdapter.class));

    }
}