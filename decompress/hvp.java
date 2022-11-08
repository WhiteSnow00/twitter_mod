// 
// Decompiled by Procyon v0.6.0
// 

public final class hvp extends gue implements rtb<snj<String>, jp7>
{
    public final /* synthetic */ jp7 C0;
    
    public hvp(final jp7 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final snj snj = (snj)o;
        zzd.f((Object)snj, "conversationIdOpt");
        final gvp gvp = new gvp(this.C0);
        final Object a = snj.a;
        snj b;
        if (a == null) {
            b = snj.b;
            final int a2 = w4j.a;
        }
        else {
            b = new snj((Object)gvp.invoke(a));
        }
        return b.h((Object)this.C0);
    }
}
