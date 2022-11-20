// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hn5
{
    public static final d Companion;
    public static final b a;
    
    static {
        Companion = new d();
        a = new b();
    }
    
    public final boolean a() {
        final boolean b = this instanceof a;
        boolean b2 = true;
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        if (n != 1) {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean b(final e e) {
        return !this.a() && ((c)this).c == e;
    }
    
    public static final class a extends hn5
    {
        public static final a b;
        
        static {
            b = new a();
        }
    }
    
    public static final class b extends y4j<hn5>
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public final Object d(final vlp vlp, int x) {
            czd.f((Object)vlp, "input");
            x = vlp.x();
            hn5 b;
            if (x != 1) {
                if (x != 2) {
                    throw new Exception(udu.z("Invalid type ", x));
                }
                final String a = vlp.A();
                czd.e((Object)a, "input.readNotNullString()");
                final String a2 = vlp.A();
                czd.e((Object)a2, "input.readNotNullString()");
                b = new c(a, e.valueOf(a2));
            }
            else {
                b = hn5.a.b;
            }
            return b;
        }
        
        public final void f(final wlp wlp, final Object o) {
            final hn5 hn5 = (hn5)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)hn5, "result");
            if (hn5 instanceof hn5.a) {
                wlp.x(1);
            }
            else if (hn5 instanceof c) {
                wlp.x(2);
                final c c = (c)hn5;
                wlp.E(c.b);
                wlp.E(c.c.D0);
            }
        }
        
        public static final class a
        {
        }
    }
    
    public static final class c extends hn5
    {
        public final String b;
        public final e c;
        
        public c(final String b, final e c) {
            czd.f((Object)b, "message");
            czd.f((Object)c, "reason");
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return czd.a((Object)this.b, (Object)c.b) && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + this.b.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String b = this.b;
            final e c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("CommunityJoinActionUnavailable(message=");
            sb.append(b);
            sb.append(", reason=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
    }
    
    public enum e
    {
        public static final a Companion;
        
        E0("Unavailable"), 
        F0("ViewerIsMember"), 
        G0("ViewerIsRemoved"), 
        H0("ViewerIsProtected"), 
        I0("ViewerRequestPending"), 
        J0("ViewerRequestRequired");
        
        public static final e[] K0;
        public final String D0;
        
        static {
            Companion = new a();
        }
        
        public e(final String d0) {
            this.D0 = d0;
        }
        
        public static final class a
        {
        }
    }
}
