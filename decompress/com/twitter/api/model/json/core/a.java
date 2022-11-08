// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.util.AbstractMap;
import java.util.Map;

public final class a extends gjr<JsonConversationControl$a>
{
    public a() {
        super((Object)JsonConversationControl$a.b, new Map.Entry[] { a("by_invitation", "by_invitation"), a("ByInvitation", "by_invitation"), a("community", "community"), a("Community", "community"), a("followers", "followers"), a("Followers", "followers") });
    }
    
    public static Map.Entry<String, JsonConversationControl$a> a(final String s, final String s2) {
        return (Map.Entry<String, JsonConversationControl$a>)new AbstractMap.SimpleImmutableEntry(s, new JsonConversationControl$a(s2));
    }
}
