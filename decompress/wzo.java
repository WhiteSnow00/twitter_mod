// 
// Decompiled by Procyon v0.6.0
// 

public final class wzo<T extends j0p> extends mvc
{
    public final o0p<T> b;
    public final u5k<T> c;
    
    public wzo(final o0p<T> b, final u5k<T> c) {
        czd.f((Object)b, "scribeItemProvider");
        czd.f((Object)c, "periscopeScribeHelper");
        this.b = b;
        this.c = c;
    }
    
    public final void a(final boolean b) {
        super.a(b);
        this.c.b("cancel_configure", this.e(), "", this.f());
    }
    
    public final void b() {
        final mvc$b a = new mvc$b();
        super.a = a;
        a.a = Boolean.TRUE;
        a.b = 1;
        this.c.b("configure", this.e(), "", this.f());
    }
    
    public final void c(final String s) {
        czd.f((Object)s, "error");
        super.c(s);
        final int b = super.a.b;
        if (b == 0) {
            return;
        }
        final int e = ib0.E(b);
        if (e != 0) {
            if (e == 1) {
                this.c.b("cancel_configure", this.e(), "fail", this.f());
            }
        }
        else {
            this.c.b("configure", this.e(), "fail", this.f());
        }
    }
    
    public final void d() {
        final int b = super.a.b;
        if (b == 0) {
            return;
        }
        final int e = ib0.E(b);
        if (e != 0) {
            if (e == 1) {
                this.c.b("cancel_configure", this.e(), "success", this.f());
            }
        }
        else {
            this.c.b("configure", this.e(), "success", this.f());
        }
    }
    
    public final String e() {
        final Boolean a = super.a.a;
        if (a != null) {
            String s;
            if (a) {
                s = "audio";
            }
            else {
                s = "video";
            }
            return s;
        }
        return "";
    }
    
    public final j0p f() {
        return this.b.a();
    }
}
