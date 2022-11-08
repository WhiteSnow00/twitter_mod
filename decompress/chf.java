import com.twitter.business.api.BusinessInputTextContentViewResult;
import com.twitter.business.api.BusinessInputTextContentViewArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chf
{
    public final sgf a;
    public final o93 b;
    public final xn6<BusinessInputTextContentViewArgs, BusinessInputTextContentViewResult> c;
    
    public chf(final mbi<?> mbi, final sgf a, final o93 b) {
        zzd.f((Object)mbi, "navigator");
        zzd.f((Object)a, "linkModuleInputArgsCreator");
        zzd.f((Object)b, "callToActionSerializer");
        this.a = a;
        this.b = b;
        this.c = mbi.a(BusinessInputTextContentViewResult.class);
    }
    
    public static final class a
    {
        public final k93 a;
        public final String b;
        
        public a(final k93 a, final String b) {
            zzd.f((Object)a, "type");
            zzd.f((Object)b, "resultingUrl");
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
            return this.a == a.a && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final k93 a = this.a;
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
