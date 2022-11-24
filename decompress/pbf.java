// 
// Decompiled by Procyon v0.6.0
// 

public interface pbf
{
    public static final class a implements pbf
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b implements pbf
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c implements pbf
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d implements pbf
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e implements pbf
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f implements pbf
    {
        public final String a;
        
        public f(final String a) {
            e0e.f((Object)a, "requestId");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && e0e.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("TimelineApiLoadMergeComplete(requestId=", this.a, ")");
        }
    }
    
    public static final class g implements pbf
    {
        public final String a;
        
        public g(final String a) {
            e0e.f((Object)a, "requestId");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && e0e.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("TimelineApiLoadMergeStart(requestId=", this.a, ")");
        }
    }
    
    public static final class h implements pbf
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i implements pbf
    {
        public final String a;
        public final Long b;
        public final btc c;
        public final Long d;
        
        public i(final String a, final Long b, final btc c, final Long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return e0e.a((Object)this.a, (Object)i.a) && e0e.a((Object)this.b, (Object)i.b) && e0e.a((Object)this.c, (Object)i.c) && e0e.a((Object)this.d, (Object)i.d);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final Long b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final btc c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Long d = this.d;
            if (d != null) {
                hashCode2 = d.hashCode();
            }
            return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final Long b = this.b;
            final btc c = this.c;
            final Long d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("TimelineApiLoadRequestComplete(requestId=");
            sb.append(a);
            sb.append(", requestOperationStartAtMs=");
            sb.append(b);
            sb.append(", httpResult=");
            sb.append(c);
            sb.append(", zipkinTraceId=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j implements pbf
    {
        public final String a;
        
        public j(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof j && e0e.a((Object)this.a, (Object)((j)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("TimelineApiLoadRequestStart(requestId=", this.a, ")");
        }
    }
    
    public static final class k implements pbf
    {
        public static final k a;
        
        static {
            a = new k();
        }
    }
    
    public static final class l implements pbf
    {
        public final String a;
        
        public l(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof l && e0e.a((Object)this.a, (Object)((l)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("TimelineApiPrefetchAttached(requestId=", this.a, ")");
        }
    }
    
    public static final class m implements pbf
    {
        public static final m a;
        
        static {
            a = new m();
        }
    }
    
    public static final class n implements pbf
    {
        public static final n a;
        
        static {
            a = new n();
        }
    }
    
    public static final class o implements pbf
    {
        public static final o a;
        
        static {
            a = new o();
        }
    }
    
    public static final class p implements pbf
    {
        public static final p a;
        
        static {
            a = new p();
        }
    }
    
    public static final class q implements pbf
    {
        public final String a;
        
        public q(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof q && e0e.a((Object)this.a, (Object)((q)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("TimelineApiPrefetchStart(requestId=", this.a, ")");
        }
    }
    
    public static final class r implements pbf
    {
        public static final r a;
        
        static {
            a = new r();
        }
    }
    
    public static final class s implements pbf
    {
        public static final s a;
        
        static {
            a = new s();
        }
    }
    
    public static final class t implements pbf
    {
        public static final t a;
        
        static {
            a = new t();
        }
    }
    
    public static final class u implements pbf
    {
        public final int a;
        
        public u(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof u && this.a == ((u)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffe.m("TimelineCacheLoadRender(loadedTweetCount=", this.a, ")");
        }
    }
    
    public static final class v implements pbf
    {
        public static final v a;
        
        static {
            a = new v();
        }
    }
    
    public static final class w implements pbf
    {
        public static final w a;
        
        static {
            a = new w();
        }
    }
    
    public static final class x implements pbf
    {
        public static final x a;
        
        static {
            a = new x();
        }
    }
}
