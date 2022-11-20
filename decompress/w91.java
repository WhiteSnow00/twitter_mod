import java.util.Objects;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w91 extends o07
{
    public final i07 a;
    public final String b;
    public final File c;
    
    public w91(final i07 a, final String b, final File c) {
        this.a = a;
        Objects.requireNonNull(b, "Null sessionId");
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final i07 a() {
        return this.a;
    }
    
    @Override
    public final File b() {
        return this.c;
    }
    
    @Override
    public final String c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o07) {
            final o07 o2 = (o07)o;
            if (!this.a.equals(o2.a()) || !this.b.equals(o2.c()) || !this.c.equals(o2.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("CrashlyticsReportWithSessionId{report=");
        j.append(this.a);
        j.append(", sessionId=");
        j.append(this.b);
        j.append(", reportFile=");
        j.append(this.c);
        j.append("}");
        return j.toString();
    }
}
