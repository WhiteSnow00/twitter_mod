import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aj3
{
    public ck3 a;
    public String b;
    public String c;
    
    public final boolean a(final qhe qhe) throws IOException {
        rje rje = qhe.i0();
        String s = null;
        boolean b;
        while (true) {
            b = false;
            if (rje == null || rje == rje.O0) {
                break;
            }
            final int ordinal = rje.ordinal();
            String d;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        if (ordinal != 7) {
                            d = s;
                        }
                        else if ("req_id".equals(s)) {
                            this.c = qhe.j();
                            d = s;
                        }
                        else {
                            d = s;
                            if ("caps_error".equals(s)) {
                                this.b = qhe.j();
                                d = s;
                            }
                        }
                    }
                    else {
                        d = qhe.d();
                    }
                }
                else {
                    qhe.m0();
                    d = s;
                }
            }
            else if ("card".equals(s)) {
                this.a = uih.c(qhe, ck3.class, false);
                d = s;
            }
            else {
                qhe.m0();
                d = s;
            }
            rje = qhe.i0();
            s = d;
        }
        if (this.a == null) {
            boolean b2 = b;
            if (!flr.g((CharSequence)this.c)) {
                return b2;
            }
            b2 = b;
            if (!flr.g((CharSequence)this.b)) {
                return b2;
            }
        }
        return true;
    }
}
