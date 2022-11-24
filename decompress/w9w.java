// 
// Decompiled by Procyon v0.6.0
// 

public final class w9w
{
    public final String a;
    public final tbl b;
    
    public w9w(final String a, final tbl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w9w)) {
            return false;
        }
        final w9w w9w = (w9w)o;
        return e0e.a((Object)this.a, (Object)w9w.a) && e0e.a((Object)this.b, (Object)w9w.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final tbl b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final tbl b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserBusinessEditableModuleV1(moduleId=");
        sb.append(a);
        sb.append(", profileModule=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
