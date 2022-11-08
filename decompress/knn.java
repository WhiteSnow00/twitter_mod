// 
// Decompiled by Procyon v0.6.0
// 

public abstract class knn
{
    public static final class a extends knn
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends knn
    {
        public final boolean a;
        
        public b(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("ShowEndSpaceConfirmation(isSpaceRecording=", this.a, ")");
        }
    }
    
    public static final class c extends knn
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends knn
    {
        public final long a;
        
        public d(final long a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && this.a == ((d)o).a);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return (int)(a ^ a >>> 32);
        }
        
        @Override
        public final String toString() {
            return tok.g("UpdateCountdownTimer(expectedTimeout=", this.a, ")");
        }
    }
}
