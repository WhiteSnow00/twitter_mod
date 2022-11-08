// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e47
{
    public static final class a extends e47
    {
        public final b52 a;
        
        public a(final b52 a) {
            zzd.f((Object)a, "folder");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final b52 a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("FolderCreated(folder=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends e47
    {
        public final nca a;
        
        public b(final nca a) {
            zzd.f((Object)a, "eventNamespace");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final nca a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Scribe(eventNamespace=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends e47
    {
        public final Throwable a;
        
        public c(final Throwable a) {
            zzd.f((Object)a, "throwable");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return x30.D("ShowError(throwable=", this.a, ")");
        }
    }
}
