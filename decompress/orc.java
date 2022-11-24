import android.text.Html$TagHandler;
import android.text.Html$ImageGetter;
import android.text.Html;
import android.os.Build$VERSION;
import android.text.Spanned;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "InlinedApi" })
public final class orc
{
    public static Spanned a(final String s, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return a.a(s, n);
        }
        return Html.fromHtml(s);
    }
    
    public static final class a
    {
        public static Spanned a(final String s, final int n) {
            return Html.fromHtml(s, n);
        }
        
        public static Spanned b(final String s, final int n, final Html$ImageGetter html$ImageGetter, final Html$TagHandler html$TagHandler) {
            return Html.fromHtml(s, n, html$ImageGetter, html$TagHandler);
        }
        
        public static String c(final Spanned spanned, final int n) {
            return Html.toHtml(spanned, n);
        }
    }
}
