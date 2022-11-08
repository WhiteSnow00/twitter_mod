import android.text.Editable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class efp implements qcw
{
    public static final class a extends efp
    {
        public final Editable a;
        
        public a(final Editable a) {
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
            final Editable a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("TextChanged(text=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
