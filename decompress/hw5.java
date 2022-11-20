// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hw5
{
    public static final f Companion;
    public static final c a;
    
    static {
        Companion = new f();
        a = new c();
    }
    
    public static final class a extends hw5
    {
        public static final a b;
        
        static {
            b = new a();
        }
    }
    
    public static final class b extends hw5
    {
        public static final b b;
        
        static {
            b = new b();
        }
    }
    
    public static final class c extends y4j<hw5>
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public final Object d(final vlp vlp, int x) {
            czd.f((Object)vlp, "input");
            x = vlp.x();
            hw5 hw5;
            if (x != 1) {
                if (x != 2) {
                    if (x != 3) {
                        throw new Exception(udu.z("Invalid type ", x));
                    }
                    hw5 = new d(vlp.G(), e.Companion.a(vlp.G()));
                }
                else {
                    hw5 = b.b;
                }
            }
            else {
                hw5 = hw5.a.b;
            }
            return hw5;
        }
        
        public final void f(final wlp wlp, final Object o) {
            final hw5 hw5 = (hw5)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)hw5, "result");
            if (hw5 instanceof hw5.a) {
                wlp.x(1);
            }
            else if (hw5 instanceof b) {
                wlp.x(2);
            }
            else if (hw5 instanceof d) {
                wlp.x(3);
                final d d = (d)hw5;
                wlp.E(d.b);
                wlp.E(d.c.D0);
            }
        }
        
        public static final class a
        {
        }
    }
    
    public static final class d extends hw5 implements iw5
    {
        public final String b;
        public final e c;
        
        public d(final String b, final e c) {
            czd.f((Object)c, "reason");
            this.b = b;
            this.c = c;
        }
        
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.b, (Object)d.b) && this.c == d.c;
        }
        
        public final int hashCode() {
            final String b = this.b;
            int hashCode;
            if (b == null) {
                hashCode = 0;
            }
            else {
                hashCode = b.hashCode();
            }
            return this.c.hashCode() + hashCode * 31;
        }
        
        public final String toString() {
            final String b = this.b;
            final e c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("CommunityTweetPinActionUnavailable(message=");
            sb.append(b);
            sb.append(", reason=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public enum e
    {
        public static final a Companion;
        
        E0("Unavailable");
        
        public static final e[] F0;
        public final String D0;
        
        static {
            Companion = new a();
        }
        
        public e(final String d0) {
            this.D0 = d0;
        }
        
        public static final class a
        {
            public final e a(final String s) {
                while (true) {
                    for (final e e : e.values()) {
                        if (czd.a((Object)s, (Object)e.D0)) {
                            final e e2 = e;
                            e e3 = e2;
                            if (e2 == null) {
                                e3 = e.E0;
                            }
                            return e3;
                        }
                    }
                    final e e2 = null;
                    continue;
                }
            }
        }
    }
    
    public static final class f
    {
    }
}
