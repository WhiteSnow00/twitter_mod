// 
// Decompiled by Procyon v0.6.0
// 

public abstract class s42
{
    public static final class a extends s42
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("AddRemoveFromFolder(tweetId=", this.a, ")");
        }
    }
    
    public static final class b extends s42
    {
        public final String a;
        public final efv b;
        
        public b(final String a, final efv b) {
            czd.f((Object)b, "scribeContext");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final efv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Added(tweetId=");
            sb.append(a);
            sb.append(", scribeContext=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends s42
    {
        public final String a;
        public final String b;
        public final boolean c;
        
        public c(final String a, final String b, final boolean c) {
            czd.f((Object)a, "name");
            czd.f((Object)b, "folderId");
            this.a = a;
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
            return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b) && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return f + c;
        }
        
        @Override
        public final String toString() {
            return wnj.D(tqf.q("AddedToFolder(name=", this.a, ", folderId=", this.b, ", closeActivity="), this.c, ")");
        }
    }
    
    public static final class d extends s42
    {
        public final String a;
        public final efv b;
        
        public d(final String a, final efv b) {
            czd.f((Object)b, "scribeContext");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && czd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final efv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("AlreadyAdded(tweetId=");
            sb.append(a);
            sb.append(", scribeContext=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends s42
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends s42
    {
        public final String a;
        
        public f(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && czd.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("Error(message=", this.a, ")");
        }
    }
    
    public static final class g extends s42
    {
        public final String a;
        
        public g() {
            this.a = null;
        }
        
        public g(final String a) {
            this.a = a;
        }
        
        public g(final String s, final int n, final rf8 rf8) {
            this.a = null;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && czd.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return da8.j("Removed(tweetId=", this.a, ")");
        }
    }
    
    public static final class h extends s42
    {
        public final String a;
        public final String b;
        public final boolean c;
        
        public h(final String a, final String b, final boolean c) {
            czd.f((Object)a, "name");
            czd.f((Object)b, "folderId");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return czd.a((Object)this.a, (Object)h.a) && czd.a((Object)this.b, (Object)h.b) && this.c == h.c;
        }
        
        @Override
        public final int hashCode() {
            final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return f + c;
        }
        
        @Override
        public final String toString() {
            return wnj.D(tqf.q("RemovedFromFolder(name=", this.a, ", folderId=", this.b, ", closeActivity="), this.c, ")");
        }
    }
}
