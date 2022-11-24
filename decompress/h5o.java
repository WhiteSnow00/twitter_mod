import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class h5o implements sdw
{
    public static final class a extends h5o
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends h5o
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends h5o
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends h5o
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends h5o
    {
        public final String a;
        
        public e(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e && e0e.a((Object)this.a, (Object)((e)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("EditSpaceConfirmed(spaceName=", this.a, ")");
        }
    }
    
    public static final class f extends h5o
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends h5o
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends h5o
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends h5o
    {
        public static final i a;
        
        static {
            a = new i();
        }
    }
    
    public static final class j extends h5o
    {
        public final Calendar a;
        
        public j(final Calendar a) {
            e0e.f((Object)a, "scheduledStartAt");
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
            final Calendar a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScheduledStartAtUpdated(scheduledStartAt=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k extends h5o
    {
        public final String a;
        
        public k(final String a) {
            e0e.f((Object)a, "newSpaceName");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof k && e0e.a((Object)this.a, (Object)((k)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("SpaceNameChanged(newSpaceName=", this.a, ")");
        }
    }
    
    public static final class l extends h5o
    {
        public static final l a;
        
        static {
            a = new l();
        }
    }
}
