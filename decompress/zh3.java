import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zh3
{
    public bj3 a;
    public String b;
    public String c;
    
    public final boolean a(final tge tge) throws IOException {
        vie vie = tge.h0();
        String s = null;
        boolean b;
        while (true) {
            b = false;
            if (vie == null || vie == vie.M0) {
                break;
            }
            final int ordinal = ((Enum)vie).ordinal();
            String d;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 7) {
                            d = s;
                        }
                        else if ("req_id".equals(s)) {
                            this.c = tge.j();
                            d = s;
                        }
                        else {
                            d = s;
                            if ("caps_error".equals(s)) {
                                this.b = tge.j();
                                d = s;
                            }
                        }
                    }
                    else {
                        d = tge.d();
                    }
                }
                else {
                    tge.l0();
                    d = s;
                }
            }
            else if ("card".equals(s)) {
                this.a = (bj3)gih.c(tge, (Class)bj3.class, false);
                d = s;
            }
            else {
                tge.l0();
                d = s;
            }
            vie = tge.h0();
            s = d;
        }
        if (this.a == null) {
            boolean b2 = b;
            if (!ikr.g((CharSequence)this.c)) {
                return b2;
            }
            b2 = b;
            if (!ikr.g((CharSequence)this.b)) {
                return b2;
            }
        }
        return true;
    }
}
