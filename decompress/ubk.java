import com.google.i18n.phonenumbers.NumberParseException;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ubk
{
    public final dml<bck> a;
    public final a8q b;
    
    public ubk(final dml<bck> a, final a8q b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a(final ock ock, final int n) {
        if (ock != null && ((bck)this.a.get()).r(ock)) {
            return ((bck)this.a.get()).e(ock, n);
        }
        return null;
    }
    
    public final String b(String a, final String s) {
        if (ikr.g((CharSequence)a)) {
            a = this.a(this.c(a, s), 2);
        }
        else {
            a = null;
        }
        if (a != null && !a.isEmpty()) {
            final StringBuilder a2 = ta0.A('\u200e');
            a2.append(a.replaceAll("\\s", " "));
            return a2.toString();
        }
        return "";
    }
    
    public final ock c(String y, String q) {
        if (ikr.e((CharSequence)y)) {
            return null;
        }
        try {
            if (!ikr.g((CharSequence)q)) {
                q = this.b.q();
            }
            final bck bck = (bck)this.a.get();
            String s = q;
            if (q == null) {
                s = "";
            }
            y = (IllegalStateException)bck.y((CharSequence)y, s.toUpperCase(Locale.ENGLISH));
            if (((bck)this.a.get()).r((ock)y)) {
                return (ock)y;
            }
            return null;
        }
        catch (final IllegalStateException y) {
            goto Label_0099;
        }
        catch (final NoSuchMethodError noSuchMethodError) {}
        catch (final NumberParseException ex) {
            goto Label_0103;
        }
    }
}
