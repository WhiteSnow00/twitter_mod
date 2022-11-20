import com.twitter.rooms.subsystem.api.args.SpacesTabFragmentArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayq implements fgg
{
    public final fob a;
    
    public ayq(final fob a) {
        czd.f((Object)a, "fragmentRegistry");
        this.a = a;
    }
    
    public final jsj a(final krm krm, final xfg xfg) {
        czd.f((Object)krm, "resourceProvider");
        czd.f((Object)xfg, "tabConfig");
        final int a = fd9.a(krm.a, 2130969784, 2131232453);
        final jsj$a jsj$a = new jsj$a(mfg.h, this.a.b((Class)SpacesTabFragmentArgs.class));
        jsj$a.d = krm.b.getString(2131958380);
        jsj$a.h = a;
        jsj$a.i = fd9.a(krm.a, 2130969785, a);
        jsj$a.k = 2131431575;
        return (jsj)((n4j)jsj$a).e();
    }
}
