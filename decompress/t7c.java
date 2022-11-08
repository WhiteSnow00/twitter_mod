import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t7c extends gue implements rtb<khe, q7c$a>
{
    public final /* synthetic */ s7c C0;
    
    public t7c(final s7c c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final khe khe = (khe)o;
        zzd.f((Object)khe, "it");
        final s7c c0 = this.C0;
        Objects.requireNonNull(c0);
        final lje e = khe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = s7c$a.a[((Enum)e).ordinal()];
        }
        if (n == 3) {
            Integer value = null;
            Integer value2 = null;
            while (khe.i0() != null) {
                final lje a = khe.a();
                int n2;
                if (a == null) {
                    n2 = -1;
                }
                else {
                    n2 = s7c$a.a[((Enum)a).ordinal()];
                }
                if (n2 != 1) {
                    if (n2 != 2) {
                        final lje e2 = khe.e();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid json token encountered: ");
                        sb.append(e2);
                        throw new InvalidJsonFormatException(sb.toString());
                    }
                    if (value != null && value2 != null) {
                        return new q7c$a((int)value, (int)value2);
                    }
                    throw new InvalidJsonFormatException("Invalid json token encountered: expected FIELD for \"line\" and \"column\" and  found none.");
                }
                else {
                    final String d = khe.d();
                    if (zzd.a((Object)d, (Object)"line")) {
                        khe.i0();
                        value = c0.c(khe);
                    }
                    else if (zzd.a((Object)d, (Object)"column")) {
                        khe.i0();
                        value2 = c0.c(khe);
                    }
                    else {
                        if (!khe.i0().G0) {
                            continue;
                        }
                        khe.m0();
                    }
                }
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        final lje e3 = khe.e();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid json token encountered: Expected OBJECT found ");
        sb2.append(e3);
        throw new InvalidJsonFormatException(sb2.toString());
    }
}
