// 
// Decompiled by Procyon v0.6.0
// 

public final class cau
{
    public String a;
    public boolean b;
    public boolean c;
    
    public final void a(final hbf hbf) {
        zzd.f((Object)hbf, "event");
        if (hbf instanceof hbf$q) {
            this.a = ((hbf$q)hbf).a;
        }
        else {
            final boolean b = hbf instanceof hbf$n;
            final int n = 1;
            if (b || hbf instanceof hbf$p) {
                this.b = false;
            }
            else if (hbf instanceof hbf$l) {
                this.b = true;
            }
            else if (hbf instanceof hbf$k) {
                this.c = true;
            }
            else {
                int n2;
                if (hbf instanceof hbf$d) {
                    n2 = n;
                }
                else {
                    n2 = ((hbf instanceof hbf$e) ? 1 : 0);
                }
                if (n2 != 0) {
                    this.c = false;
                }
                else if (hbf instanceof hbf$j && this.c && !this.b) {
                    this.a = ((hbf$j)hbf).a;
                }
            }
        }
    }
}
