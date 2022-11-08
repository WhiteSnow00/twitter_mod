// 
// Decompiled by Procyon v0.6.0
// 

public abstract class peh
{
    public static final class a extends peh
    {
        public final String a;
        
        public a(final String a) {
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
            return zi.y("ShowMobileAppStore(mobileAppStoreUrl=", this.a, ")");
        }
    }
}
