// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qfp
{
    public static final c Companion;
    public static final s4j<qfp> c;
    public final String a;
    public final nca b;
    
    static {
        Companion = new c();
        qfp.c = new qfp$b();
    }
    
    public qfp(final String a) {
        this.a = a;
        this.b = nca.Companion.b((taa)taa.a, a, "send_self_reply");
    }
    
    public static final class c
    {
        public final qfp a(final String s) {
            Object o;
            if (s != null) {
                switch (s) {
                    case "compose": {
                        o = qfp$e.d;
                        return (qfp)o;
                    }
                    case "reply": {
                        o = qfp$f.d;
                        return (qfp)o;
                    }
                    case "cta": {
                        o = qfp$a.d;
                        return (qfp)o;
                    }
                    case "thread": {
                        o = qfp$d.d;
                        return (qfp)o;
                    }
                    default:
                        break;
                }
                o = qfp$g.d;
            }
            else {
                o = null;
            }
            return (qfp)o;
        }
    }
}
