import com.twitter.business.api.BusinessInputTextContentViewResult;
import com.twitter.business.api.BusinessInputTextContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhf
{
    public final bhf a;
    public final z93 b;
    public final jo6<BusinessInputTextContentViewArgs, BusinessInputTextContentViewResult> c;
    
    public lhf(final fci<?> fci, final bhf a, final z93 b) {
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)a, "linkModuleInputArgsCreator");
        e0e.f((Object)b, "callToActionSerializer");
        this.a = a;
        this.b = b;
        this.c = fci.a(BusinessInputTextContentViewResult.class);
    }
    
    public static final class a
    {
        public final v93 a;
        public final String b;
        
        public a(final v93 a, final String b) {
            e0e.f((Object)a, "type");
            e0e.f((Object)b, "resultingUrl");
            this.a = a;
            this.b = b;
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
            return this.a == a.a && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final v93 a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("LinkTextInputResult(type=");
            sb.append(a);
            sb.append(", resultingUrl=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
