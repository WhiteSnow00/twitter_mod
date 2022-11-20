import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pm7
{
    public final String a;
    public final d b;
    public final e c;
    public final f d;
    
    public pm7(final String a, final d b, final e c, final f d) {
        czd.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pm7)) {
            return false;
        }
        final pm7 pm7 = (pm7)o;
        return czd.a((Object)this.a, (Object)pm7.a) && czd.a((Object)this.b, (Object)pm7.b) && czd.a((Object)this.c, (Object)pm7.c) && czd.a((Object)this.d, (Object)pm7.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final d b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final e c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final f d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final d b = this.b;
        final e c = this.c;
        final f d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMEventSliceResult(__typename=");
        sb.append(a);
        sb.append(", onDMEventSlice=");
        sb.append(b);
        sb.append(", onDMEventSliceFailure=");
        sb.append(c);
        sb.append(", onDMEventSliceInvalidRequest=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final j a;
        
        public a(final j a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final j a = this.a;
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
            final j a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Dm_event_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final c b;
        
        public b(final String a, final c b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Item(__typename=");
            sb.append(a);
            sb.append(", onDMEventItem=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final a a;
        
        public c(final a a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && czd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final a a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnDMEventItem(dm_event_results=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final List<b> a;
        public final k b;
        
        public d(final List<b> a, final k b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && czd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final List<b> a = this.a;
            final k b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnDMEventSlice(items=");
            sb.append(a);
            sb.append(", slice_info=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final nm7 b;
        public final xt6 c;
        public final skw d;
        
        public e(final String a, final nm7 b, final xt6 c, final skw d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return czd.a((Object)this.a, (Object)e.a) && this.b == e.b && this.c == e.c && this.d == e.d;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final int hashCode3 = this.b.hashCode();
            final xt6 c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final skw d = this.d;
            if (d != null) {
                hashCode = d.hashCode();
            }
            return ((hashCode3 + hashCode2 * 31) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final nm7 b = this.b;
            final xt6 c = this.c;
            final skw d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnDMEventSliceFailure(message=");
            sb.append(a);
            sb.append(", reason=");
            sb.append(b);
            sb.append(", conversation_validation_failure_type=");
            sb.append(c);
            sb.append(", user_validation_failure_type=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final om7 a;
        public final i b;
        
        public f(final om7 a, final i b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return this.a == f.a && czd.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final om7 a = this.a;
            final i b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnDMEventSliceInvalidRequest(dm_event_slice_invalid_request_reason=");
            sb.append(a);
            sb.append(", parameter_validation_error_response=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final String a;
        public final String b;
        
        public g(final String a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return czd.a((Object)this.a, (Object)g.a) && czd.a((Object)this.b, (Object)g.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return zh8.o("Parameter(parameter_name=", this.a, ", parameter_value=", this.b, ")");
        }
    }
    
    public static final class h
    {
        public final String a;
        public final List<g> b;
        
        public h(final String a, final List<g> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return czd.a((Object)this.a, (Object)h.a) && czd.a((Object)this.b, (Object)h.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return ta0.y("Parameter_error(error_message=", this.a, ", parameters=", (List)this.b, ")");
        }
    }
    
    public static final class i
    {
        public final List<h> a;
        
        public i(final List<h> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && czd.a((Object)this.a, (Object)((i)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return wc0.z("Parameter_validation_error_response(parameter_errors=", (List)this.a, ")");
        }
    }
    
    public static final class j
    {
        public final String a;
        public final xg7 b;
        
        public j(final String a, final xg7 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return czd.a((Object)this.a, (Object)j.a) && czd.a((Object)this.b, (Object)j.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final xg7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", dMChatEventResult=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k
    {
        public final String a;
        public final ueq b;
        
        public k(final String a, final ueq b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return czd.a((Object)this.a, (Object)k.a) && czd.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ueq b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Slice_info(__typename=");
            sb.append(a);
            sb.append(", sliceInfo=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
