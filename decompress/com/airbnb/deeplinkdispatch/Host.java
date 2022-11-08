// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003�\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004�\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006�\u0006\u0010" }, d2 = { "Lcom/airbnb/deeplinkdispatch/Host;", "Lcom/airbnb/deeplinkdispatch/TreeNode;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "deeplinkdispatch-base" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
public final class Host extends TreeNode
{
    private final String id;
    
    public Host(final String id) {
        zzd.f((Object)id, "id");
        super(id, new NodeMetadata((byte)4, id));
        this.id = id;
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final Host copy(final String s) {
        zzd.f((Object)s, "id");
        return new Host(s);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof Host && zzd.a((Object)this.getId(), (Object)((Host)o).getId()));
    }
    
    public String getId() {
        return this.id;
    }
    
    public int hashCode() {
        return this.getId().hashCode();
    }
    
    public String toString() {
        final StringBuilder g = w48.g("Host(id=");
        g.append(this.getId());
        g.append(')');
        return g.toString();
    }
}
