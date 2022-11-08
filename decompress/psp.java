import android.content.ClipData;
import android.content.ClipData$Item;
import android.net.Uri;
import java.util.ArrayList;
import android.content.Intent;
import android.text.Html;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psp
{
    public static String a(final CharSequence charSequence) {
        return Html.escapeHtml(charSequence);
    }
    
    public static void b(final Intent intent, final ArrayList<Uri> list) {
        final ClipData clipData = new ClipData((CharSequence)null, new String[] { intent.getType() }, new ClipData$Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent)null, (Uri)list.get(0)));
        for (int size = list.size(), i = 1; i < size; ++i) {
            clipData.addItem(new ClipData$Item((Uri)list.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
    
    public static void c(final Intent intent) {
        intent.setClipData((ClipData)null);
        intent.setFlags(intent.getFlags() & 0xFFFFFFFE);
    }
}
