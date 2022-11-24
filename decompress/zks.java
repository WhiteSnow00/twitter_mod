import android.content.ClipData$Item;
import android.content.Context;
import android.content.ClipData;
import android.text.Spannable;
import android.text.Selection;
import android.text.Spanned;
import android.text.Editable;
import android.widget.TextView;
import android.util.Log;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zks implements bkj
{
    public final pm6 a(final View view, final pm6 pm6) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(pm6);
            Log.d("ReceiveContent", sb.toString());
        }
        if (pm6.a.m() == 2) {
            return pm6;
        }
        final ClipData b = pm6.b();
        final int h = pm6.a.h();
        final TextView textView = (TextView)view;
        final Editable editable = (Editable)textView.getText();
        final Context context = ((View)textView).getContext();
        int i = 0;
        int n = 0;
        while (i < b.getItemCount()) {
            final ClipData$Item item = b.getItemAt(i);
            CharSequence charSequence2;
            if ((h & 0x1) != 0x0) {
                final CharSequence charSequence = charSequence2 = item.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence2 = charSequence.toString();
                }
            }
            else {
                charSequence2 = item.coerceToStyledText(context);
            }
            int n2 = n;
            if (charSequence2 != null) {
                if (n == 0) {
                    final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                    final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection((Spannable)editable, max2);
                    editable.replace(max, max2, charSequence2);
                    n2 = 1;
                }
                else {
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), charSequence2);
                    n2 = n;
                }
            }
            ++i;
            n = n2;
        }
        return null;
    }
}
