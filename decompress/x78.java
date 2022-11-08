// 
// Decompiled by Procyon v0.6.0
// 

public final class x78
{
    public final xau a;
    
    public x78(final xau a) {
        this.a = a;
    }
    
    public final void a(final String s, String j) {
        j = this.a.j(j, "");
        if ("".equals(j)) {
            this.a.i().b(s, (String)null).e();
        }
        else {
            this.a.i().b(s, j).e();
        }
    }
    
    public final void b(String j, final String s) {
        j = this.a.j(j, "");
        if (!"".equals(j)) {
            this.a.i().b(s, j).e();
        }
    }
}
