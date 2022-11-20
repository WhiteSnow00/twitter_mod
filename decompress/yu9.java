// 
// Decompiled by Procyon v0.6.0
// 

public final class yu9 implements ie4$b
{
    public final int D0;
    public final o5w E0;
    
    public yu9(final o5w e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void e(final sfs sfs) {
        switch (this.D0) {
            default: {
                final o5w e0 = this.E0;
                final ajs ajs = (ajs)sfs;
                czd.f((Object)e0, "$uriNavigator");
                czd.f((Object)ajs, "textEntity");
                final String d0 = ajs.D0;
                czd.e((Object)d0, "textEntity.linkUrl");
                e0.c(d0);
                return;
            }
            case 0: {
                final o5w e2 = this.E0;
                final ajs ajs2 = (ajs)sfs;
                czd.f((Object)e2, "$uriNavigator");
                czd.f((Object)ajs2, "textEntity");
                final String d2 = ajs2.D0;
                czd.e((Object)d2, "textEntity.linkUrl");
                e2.c(d2);
            }
        }
    }
}
