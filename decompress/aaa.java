// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aaa
{
    public static final class a extends aaa
    {
        public final m9a a;
        
        public a(final m9a a) {
            zzd.f((Object)a, "timelineItem");
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
            final m9a a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("LaunchBugReportWindow(timelineItem=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
