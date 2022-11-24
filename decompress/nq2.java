// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nq2 implements sdw
{
    public final long a;
    
    public nq2(final long a) {
        this.a = a;
    }
    
    public abstract long a();
    
    public static final class a extends nq2
    {
        public final long b;
        
        public a(final long b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final long a() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && this.b == ((a)o).b);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            return (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            return k5b.m("BottomBarClicked(duration=", this.b, ")");
        }
    }
    
    public static final class b extends nq2
    {
        public final long b;
        
        public b(final long b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final long a() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.b == ((b)o).b);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            return (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            return k5b.m("BottomBarCtaClicked(duration=", this.b, ")");
        }
    }
    
    public static final class c extends nq2
    {
        public final long b;
        
        public c(final long b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final long a() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && this.b == ((c)o).b);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            return (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            return k5b.m("CloseBrowserClicked(duration=", this.b, ")");
        }
    }
    
    public static final class d extends nq2
    {
        public final long b;
        
        public d(final long b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final long a() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && this.b == ((d)o).b);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            return (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            return k5b.m("LoadingCompleted(duration=", this.b, ")");
        }
    }
    
    public static final class e extends nq2
    {
        public final jlk$a b;
        public final long c;
        
        public e(final jlk$a b, final long c) {
            e0e.f((Object)b, "error");
            super(c);
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final long a() {
            return this.c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return e0e.a((Object)this.b, (Object)e.b) && this.c == e.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            final long c = this.c;
            return hashCode * 31 + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            final jlk$a b = this.b;
            final long c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("WebViewErrorReceived(error=");
            sb.append(b);
            sb.append(", duration=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f extends nq2
    {
        public final long b;
        
        public f(final long b) {
            super(b);
            this.b = b;
        }
        
        @Override
        public final long a() {
            return this.b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && this.b == ((f)o).b);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            return (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            return k5b.m("WebviewCtaClicked(duration=", this.b, ")");
        }
    }
}
