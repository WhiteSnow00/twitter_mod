import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yyo<T extends szo> extends bwc
{
    public final xzo<T> b;
    public final n5k<T> c;
    
    public yyo(final xzo<T> b, final n5k<T> c) {
        zzd.f((Object)b, "scribeItemProvider");
        zzd.f((Object)c, "periscopeScribeHelper");
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        super.a();
        this.c.b("cancel_request", this.e(), "", this.f());
    }
    
    public final void b(final boolean b) {
        final bwc$b a = new bwc$b();
        super.a = a;
        a.a = b;
        Objects.requireNonNull(super.a);
        this.c.b("in_broadcast_actions_menu", "cancel_request_screen", "impression", this.f());
    }
    
    public final void c(final boolean b) {
        final bwc$b a = new bwc$b();
        super.a = a;
        a.a = b;
        Objects.requireNonNull(super.a);
        this.c.b("chat_bottom_bar", "cancel_request_screen", "impression", this.f());
    }
    
    public final void d(final String s) {
        zzd.f((Object)s, "error");
        Objects.requireNonNull(super.a);
        final int b = super.a.b;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            return;
        }
        this.c.b("cancel_request", this.e(), "fail", this.f());
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
    
    public final szo f() {
        return this.b.a();
    }
}
