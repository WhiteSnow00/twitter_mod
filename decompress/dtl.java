// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dtl
{
    public final int a;
    
    public dtl(final int a) {
        this.a = a;
    }
    
    public static final class a extends dtl
    {
        public final String b;
        public final long c;
        
        public a(final String b, final long c) {
            super(8);
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.b, (Object)a.b) && this.c == a.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            final long c = this.c;
            return hashCode * 31 + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder i = hfe.i("BlockUser(userName=", this.b, ", userId=", this.c);
            i.append(")");
            return i.toString();
        }
    }
    
    public static final class b extends dtl
    {
        public final jp7 b;
        
        public b(final jp7 b) {
            super(3);
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.b, (Object)((b)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            final jp7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("LeaveGroupConversation(inboxItem=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends dtl
    {
        public final jp7 b;
        
        public c(final jp7 b) {
            super(4);
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.b, (Object)((c)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            final jp7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("LeaveOneToOneConversation(inboxItem=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends dtl
    {
        public static final d b;
        
        static {
            b = new d();
        }
        
        public d() {
            super(5);
        }
    }
    
    public static final class e extends dtl
    {
        public final String b;
        public final long c;
        
        public e(final String b, final long c) {
            super(6);
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.b, (Object)e.b) && this.c == e.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            final long c = this.c;
            return hashCode * 31 + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder i = hfe.i("ReportUser(userName=", this.b, ", userId=", this.c);
            i.append(")");
            return i.toString();
        }
    }
    
    public static final class f extends dtl
    {
        public final String b;
        public final long c;
        
        public f(final String b, final long c) {
            super(7);
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return zzd.a((Object)this.b, (Object)f.b) && this.c == f.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            final long c = this.c;
            return hashCode * 31 + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder i = hfe.i("UnblockUser(userName=", this.b, ", userId=", this.c);
            i.append(")");
            return i.toString();
        }
    }
    
    public static final class g extends dtl
    {
        public final jp7 b;
        
        public g(final jp7 b) {
            super(1);
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && zzd.a((Object)this.b, (Object)((g)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            final jp7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ViewParticipants(inboxItem=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h extends dtl
    {
        public static final h b;
        
        static {
            b = new h();
        }
        
        public h() {
            super(2);
        }
    }
}
