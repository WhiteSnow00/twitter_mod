import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag6
{
    public static final rlp<ag6> d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        ag6.d = new ag6.ag6$b();
    }
    
    public ag6(final ag6.ag6$a ag6$a) {
        this.a = ag6$a.a;
        this.b = ag6$a.b;
        this.c = ag6$a.c;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        final String a = this.a;
        if (a != null) {
            afe.t0("people_module_id", a);
        }
        final String b = this.b;
        if (b != null) {
            afe.t0("people_module_name", b);
        }
        final String c = this.c;
        if (c != null) {
            afe.t0("people_module_token", c);
        }
        afe.h();
    }
}
