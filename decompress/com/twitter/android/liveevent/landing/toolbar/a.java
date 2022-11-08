// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.liveevent.landing.toolbar;

public final class a
{
    public final cwf a;
    public final o5t b;
    public final bzf c;
    public a d;
    public final m29 e;
    
    public a(final cwf a, final o5t b, final bzf c, final ibm ibm) {
        zzd.f((Object)a, "metadataDispatcher");
        zzd.f((Object)b, "tabCustomizationHelper");
        zzd.f((Object)c, "coordinatorHelper");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new m29();
        c.f();
        ibm.i((rj)new igc((Object)this, 2));
    }
    
    public interface a extends bzf.a
    {
    }
}
