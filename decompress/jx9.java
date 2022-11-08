import android.os.BaseBundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Objects;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.view.inputmethod.EditorInfo;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "PrivateConstructorForUtilityClass" })
public final class jx9
{
    public static final String[] a;
    
    static {
        a = new String[0];
    }
    
    public static String[] a(final EditorInfo editorInfo) {
        if (Build$VERSION.SDK_INT >= 25) {
            String[] array = editorInfo.contentMimeTypes;
            if (array == null) {
                array = jx9.a;
            }
            return array;
        }
        final Bundle extras = editorInfo.extras;
        if (extras == null) {
            return jx9.a;
        }
        String[] array2;
        if ((array2 = ((BaseBundle)extras).getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) == null) {
            array2 = ((BaseBundle)editorInfo.extras).getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (array2 == null) {
            array2 = jx9.a;
        }
        return array2;
    }
    
    public static boolean b(final CharSequence charSequence, final int n, final int n2) {
        if (n2 != 0) {
            return n2 == 1 && Character.isHighSurrogate(charSequence.charAt(n));
        }
        return Character.isLowSurrogate(charSequence.charAt(n));
    }
    
    public static void c(final EditorInfo editorInfo, final String[] contentMimeTypes) {
        if (Build$VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = contentMimeTypes;
        }
        else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            ((BaseBundle)editorInfo.extras).putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", contentMimeTypes);
            ((BaseBundle)editorInfo.extras).putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", contentMimeTypes);
        }
    }
    
    public static void d(final EditorInfo editorInfo, CharSequence charSequence) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            jx9.a.a(editorInfo, charSequence);
        }
        else {
            Objects.requireNonNull(charSequence);
            if (sdk_INT >= 30) {
                jx9.a.a(editorInfo, charSequence);
            }
            else {
                int initialSelStart = editorInfo.initialSelStart;
                final int initialSelEnd = editorInfo.initialSelEnd;
                int n;
                if (initialSelStart > initialSelEnd) {
                    n = initialSelEnd + 0;
                }
                else {
                    n = initialSelStart + 0;
                }
                if (initialSelStart > initialSelEnd) {
                    initialSelStart += 0;
                }
                else {
                    initialSelStart = initialSelEnd + 0;
                }
                final int length = charSequence.length();
                if (n >= 0 && initialSelStart <= length) {
                    final int n2 = editorInfo.inputType & 0xFFF;
                    if (n2 == 129 || n2 == 225 || n2 == 18) {
                        e(editorInfo, null, 0, 0);
                    }
                    else if (length <= 2048) {
                        e(editorInfo, charSequence, n, initialSelStart);
                    }
                    else {
                        final int n3 = initialSelStart - n;
                        int n4;
                        if (n3 > 1024) {
                            n4 = 0;
                        }
                        else {
                            n4 = n3;
                        }
                        final int length2 = charSequence.length();
                        final int n5 = 2048 - n4;
                        final int min = Math.min(length2 - initialSelStart, n5 - Math.min(n, (int)(n5 * 0.8)));
                        final int min2 = Math.min(n, n5 - min);
                        int n7;
                        final int n6 = n7 = n - min2;
                        int n8 = min2;
                        if (b(charSequence, n6, 0)) {
                            n7 = n6 + 1;
                            n8 = min2 - 1;
                        }
                        int n9 = min;
                        if (b(charSequence, initialSelStart + min - 1, 1)) {
                            n9 = min - 1;
                        }
                        if (n4 != n3) {
                            charSequence = TextUtils.concat(new CharSequence[] { charSequence.subSequence(n7, n7 + n8), charSequence.subSequence(initialSelStart, n9 + initialSelStart) });
                        }
                        else {
                            charSequence = charSequence.subSequence(n7, n8 + n4 + n9 + n7);
                        }
                        final int n10 = n8 + 0;
                        e(editorInfo, charSequence, n10, n4 + n10);
                    }
                }
                else {
                    e(editorInfo, null, 0, 0);
                }
            }
        }
    }
    
    public static void e(final EditorInfo editorInfo, final CharSequence charSequence, final int n, final int n2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        Object o;
        if (charSequence != null) {
            o = new SpannableStringBuilder(charSequence);
        }
        else {
            o = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)o);
        ((BaseBundle)editorInfo.extras).putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n);
        ((BaseBundle)editorInfo.extras).putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n2);
    }
    
    public static final class a
    {
        public static void a(final EditorInfo editorInfo, final CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }
}
