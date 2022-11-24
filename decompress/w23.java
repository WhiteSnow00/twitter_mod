import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;
import com.twitter.business.model.listselection.BusinessListSelectionData;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w23 implements sdw
{
    public static final class a extends w23
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends w23
    {
        public final al6 a;
        
        public b(final al6 a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final al6 a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ContactMethodClicked(contactType=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends w23
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends w23
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends w23
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends w23
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends w23
    {
        public final BusinessListSelectionData a;
        
        public g(final BusinessListSelectionData a) {
            e0e.f((Object)a, "selectedItem");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && e0e.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final BusinessListSelectionData a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ListSelectionFinished(selectedItem=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h extends w23
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends w23
    {
        public final BusinessInputTextType a;
        public final String b;
        
        public i(final BusinessInputTextType a, final String b) {
            e0e.f((Object)a, "type");
            e0e.f((Object)b, "inputTextEntered");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return this.a == i.a && e0e.a((Object)this.b, (Object)i.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final BusinessInputTextType a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("TextEntered(type=");
            sb.append(a);
            sb.append(", inputTextEntered=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
