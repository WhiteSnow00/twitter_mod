import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yh implements ay9<xh>
{
    public final mbi<?> C0;
    
    public yh(final mbi<?> c0) {
        zzd.f((Object)c0, "navigator");
        this.C0 = c0;
    }
    
    public final void a(final xh xh) {
        zzd.f((Object)xh, "effect");
        if (xh instanceof xh$c) {
            this.C0.b(((xh$c)xh).a);
        }
        else if (xh instanceof xh$a) {
            this.C0.j();
        }
        else {
            if (!(xh instanceof xh$b)) {
                throw new NoWhenBranchMatchedException();
            }
            saw.b((okm)((xh$b)xh).a);
        }
    }
}
