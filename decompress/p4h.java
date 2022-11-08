import android.view.MenuItem;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class p4h
{
    public static final class a extends p4h
    {
        public final Menu a;
        
        public a(final Menu a) {
            zzd.f((Object)a, "menu");
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
            final Menu a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Create(menu=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends p4h
    {
        public final MenuItem a;
        
        public b(final MenuItem a) {
            zzd.f((Object)a, "menuItem");
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
            final MenuItem a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("MenuItemClick(menuItem=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends p4h
    {
        public final Menu a;
        
        public c(final Menu a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final Menu a = this.a;
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
            final Menu a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("MenuOverflowClick(menu=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends p4h
    {
        public final Menu a;
        
        public d(final Menu a) {
            zzd.f((Object)a, "menu");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && zzd.a((Object)this.a, (Object)((d)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final Menu a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Prepare(menu=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
