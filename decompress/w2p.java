import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w2p<T extends d1p> extends f0d
{
    public final i1p<T> b;
    public final h6k<T> c;
    
    public w2p(final i1p<T> b, final h6k<T> c) {
        e0e.f((Object)b, "scribeItemProvider");
        e0e.f((Object)c, "periscopeScribeHelper");
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        Objects.requireNonNull(super.a);
        super.a.b = 1;
        this.c.b("request", "disclaimer", "cancel", this.k());
    }
    
    public final void b() {
        super.b();
        this.c.b("request", "disclaimer", "confirm", this.k());
    }
    
    public final void c(final boolean b) {
        super.a.a = b;
        super.a.b = 2;
        this.c.b("request", this.j(), "", this.k());
    }
    
    public final void d() {
        super.a = new f0d$b();
        this.c.b("in_broadcast_actions_menu", "request_screen", "impression", this.k());
    }
    
    public final void e() {
        super.a = new f0d$b();
        this.c.b("chat_bottom_bar", "request_screen", "impression", this.k());
    }
    
    public final void f() {
        super.a = new f0d$b();
        this.c.b("in_broadcast_chat_prompt", "request_screen", "impression", this.k());
    }
    
    public final void g(final boolean b) {
        Objects.requireNonNull(super.a);
        Objects.requireNonNull(super.a);
        final h6k<T> c = this.c;
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        c.b("request", "notify_followers", s, this.k());
    }
    
    public final void h(final String s) {
        e0e.f((Object)s, "error");
        super.h(s);
        final int b = super.a.b;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            return;
        }
        this.c.b("request", this.j(), "fail", this.k());
    }
    
    public final void i() {
        final int b = super.a.b;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            return;
        }
        this.c.b("request", this.j(), "success", this.k());
    }
    
    public final String j() {
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
    
    public final d1p k() {
        return this.b.a();
    }
}
