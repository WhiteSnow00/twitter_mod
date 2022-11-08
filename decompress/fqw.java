// 
// Decompiled by Procyon v0.6.0
// 

public final class fqw implements ay9<eqw>
{
    public final mbi<?> C0;
    
    public fqw(final mbi<?> c0) {
        zzd.f((Object)c0, "navigator");
        this.C0 = c0;
    }
    
    public final void a(final eqw eqw) {
        zzd.f((Object)eqw, "effect");
        if (eqw instanceof eqw$a) {
            this.C0.j();
        }
        else if (eqw instanceof eqw$c) {
            this.C0.b(((eqw$c)eqw).a);
        }
        else if (eqw instanceof eqw$b) {
            saw.b((okm)((eqw$b)eqw).a);
        }
    }
}
