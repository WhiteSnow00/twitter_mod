// 
// Decompiled by Procyon v0.6.0
// 

public final class v2x implements y94
{
    public u4 C0;
    public final nbq<omk> D0;
    
    public v2x() {
        this.D0 = new nbq<omk>() {
            public final /* synthetic */ v2x C0;
            
            public final void b(final Object o) {
                final omk omk = (omk)o;
                zzd.f((Object)omk, "playbackSpeed");
                final u4 c0 = this.C0.C0;
                if (c0 != null) {
                    ((fyd)c0.f).q((dyd)new mmk(omk.C0));
                }
            }
            
            public final void onError(final Throwable t) {
                zzd.f((Object)t, "e");
            }
            
            public final void onSubscribe(final j29 j29) {
                zzd.f((Object)j29, "d");
            }
        };
    }
    
    public final void g(final u4 c0) {
        zzd.f((Object)c0, "attachment");
        this.C0 = c0;
    }
    
    public final void h() {
    }
    
    public final void unbind() {
        this.C0 = null;
    }
}
