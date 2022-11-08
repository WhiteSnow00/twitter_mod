import android.text.Spanned;
import android.os.BaseBundle;
import android.text.Selection;
import android.text.Editable;
import java.util.Objects;
import android.os.Bundle;
import androidx.emoji2.text.c;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1a extends InputConnectionWrapper
{
    public final TextView a;
    public final a b;
    
    public k1a(final TextView a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        final a b = new a();
        int int1 = 0;
        super(inputConnection, false);
        this.a = a;
        this.b = b;
        if (c.d()) {
            final c a2 = c.a();
            if (a2.e()) {
                if (editorInfo != null) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    final c.a e = a2.e;
                    Objects.requireNonNull(e);
                    final Bundle extras = editorInfo.extras;
                    final j9h a3 = e.c.a;
                    final int a4 = a3.a(4);
                    if (a4 != 0) {
                        int1 = a3.b.getInt(a4 + a3.a);
                    }
                    ((BaseBundle)extras).putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
                    editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", e.a.g);
                }
            }
        }
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        return this.b.a((InputConnection)this, this.a.getEditableText(), n, n2, false) || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return this.b.a((InputConnection)this, this.a.getEditableText(), n, n2, true) || super.deleteSurroundingTextInCodePoints(n, n2);
    }
    
    public static final class a
    {
        public final boolean a(final InputConnection inputConnection, final Editable editable, int n, int i, final boolean b) {
            final Object j = c.j;
            boolean b3;
            final boolean b2 = b3 = false;
            if (editable != null) {
                if (inputConnection == null) {
                    b3 = b2;
                }
                else {
                    b3 = b2;
                    if (n >= 0) {
                        if (i < 0) {
                            b3 = b2;
                        }
                        else {
                            final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                            if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
                                b3 = b2;
                            }
                            else {
                                int n4;
                                if (b) {
                                    final int max = Math.max(n, 0);
                                    n = ((CharSequence)editable).length();
                                    Label_0245: {
                                        Label_0243: {
                                            if (selectionStart >= 0) {
                                                if (n >= selectionStart) {
                                                    n = selectionStart;
                                                    int k;
                                                    if ((k = max) >= 0) {
                                                    Label_0150:
                                                        while (true) {
                                                            int n2 = 0;
                                                            while (k != 0) {
                                                                if (--n < 0) {
                                                                    if (n2 != 0) {
                                                                        break Label_0243;
                                                                    }
                                                                    n = 0;
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char1 = ((CharSequence)editable).charAt(n);
                                                                    if (n2 != 0) {
                                                                        if (!Character.isHighSurrogate(char1)) {
                                                                            break Label_0243;
                                                                        }
                                                                        --k;
                                                                        continue Label_0150;
                                                                    }
                                                                    else if (!Character.isSurrogate(char1)) {
                                                                        --k;
                                                                    }
                                                                    else {
                                                                        if (Character.isHighSurrogate(char1)) {
                                                                            break Label_0243;
                                                                        }
                                                                        n2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0245;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n = -1;
                                    }
                                    final int max2 = Math.max(i, 0);
                                    final int length = ((CharSequence)editable).length();
                                    Label_0397: {
                                        Label_0394: {
                                            if (selectionEnd >= 0) {
                                                if (length >= selectionEnd) {
                                                    i = selectionEnd;
                                                    int l;
                                                    if ((l = max2) >= 0) {
                                                    Label_0292:
                                                        while (true) {
                                                            int n3 = 0;
                                                            while (l != 0) {
                                                                if (i >= length) {
                                                                    i = length;
                                                                    if (n3 != 0) {
                                                                        break Label_0394;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char2 = ((CharSequence)editable).charAt(i);
                                                                    if (n3 != 0) {
                                                                        if (!Character.isLowSurrogate(char2)) {
                                                                            break Label_0394;
                                                                        }
                                                                        --l;
                                                                        ++i;
                                                                        continue Label_0292;
                                                                    }
                                                                    else if (!Character.isSurrogate(char2)) {
                                                                        --l;
                                                                        ++i;
                                                                    }
                                                                    else {
                                                                        if (Character.isLowSurrogate(char2)) {
                                                                            break Label_0394;
                                                                        }
                                                                        ++i;
                                                                        n3 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0397;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = -1;
                                    }
                                    b3 = b2;
                                    if (n == -1) {
                                        return b3;
                                    }
                                    if ((n4 = i) == -1) {
                                        b3 = b2;
                                        return b3;
                                    }
                                }
                                else {
                                    n = Math.max(selectionStart - n, 0);
                                    n4 = Math.min(selectionEnd + i, ((CharSequence)editable).length());
                                }
                                final s1a[] array = (s1a[])((Spanned)editable).getSpans(n, n4, (Class)s1a.class);
                                b3 = b2;
                                if (array != null) {
                                    b3 = b2;
                                    if (array.length > 0) {
                                        int length2;
                                        s1a s1a;
                                        int spanStart;
                                        int spanEnd;
                                        for (length2 = array.length, i = 0; i < length2; ++i) {
                                            s1a = array[i];
                                            spanStart = ((Spanned)editable).getSpanStart((Object)s1a);
                                            spanEnd = ((Spanned)editable).getSpanEnd((Object)s1a);
                                            n = Math.min(spanStart, n);
                                            n4 = Math.max(spanEnd, n4);
                                        }
                                        n = Math.max(n, 0);
                                        i = Math.min(n4, ((CharSequence)editable).length());
                                        inputConnection.beginBatchEdit();
                                        editable.delete(n, i);
                                        inputConnection.endBatchEdit();
                                        b3 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b3;
        }
    }
}
