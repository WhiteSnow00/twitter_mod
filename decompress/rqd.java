import android.os.BaseBundle;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputConnectionWrapper;
import android.os.Build$VERSION;
import java.util.Objects;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "PrivateConstructorForUtilityClass" })
public final class rqd
{
    @Deprecated
    public static InputConnection a(final InputConnection inputConnection, final EditorInfo editorInfo, final c c) {
        Objects.requireNonNull(editorInfo, "editorInfo must be non-null");
        Objects.requireNonNull(c, "onCommitContentListener must be non-null");
        if (Build$VERSION.SDK_INT >= 25) {
            return (InputConnection)new InputConnectionWrapper(inputConnection, c) {
                public final c a;
                
                public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
                    final c a = this.a;
                    sqd sqd = null;
                    if (inputContentInfo != null) {
                        if (Build$VERSION.SDK_INT >= 25) {
                            sqd = new sqd((sqd$c)new sqd$a((Object)inputContentInfo));
                        }
                    }
                    return a.c(sqd, n, bundle) || super.commitContent(inputContentInfo, n, bundle);
                }
            };
        }
        if (vw9.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return (InputConnection)new InputConnectionWrapper(inputConnection, c) {
            public final c a;
            
            public final boolean performPrivateCommand(final String s, Bundle bundle) {
                final c a = this.a;
                int int1 = 0;
                final int n = 0;
                if (bundle != null) {
                    boolean b;
                    if (TextUtils.equals((CharSequence)"androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
                        b = false;
                    }
                    else {
                        if (!TextUtils.equals((CharSequence)"android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
                            return int1 != 0 || super.performPrivateCommand(s, bundle);
                        }
                        b = true;
                    }
                    String s2;
                    if (b) {
                        s2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                    }
                    else {
                        s2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                    }
                    try {
                        final ResultReceiver resultReceiver = (ResultReceiver)bundle.getParcelable(s2);
                        String s3;
                        if (b) {
                            s3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                        }
                        else {
                            s3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                        }
                        try {
                            final Uri uri = (Uri)bundle.getParcelable(s3);
                            String s4;
                            if (b) {
                                s4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                            }
                            else {
                                s4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                            }
                            final ClipDescription clipDescription = (ClipDescription)bundle.getParcelable(s4);
                            String s5;
                            if (b) {
                                s5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                            }
                            else {
                                s5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                            }
                            final Uri uri2 = (Uri)bundle.getParcelable(s5);
                            String s6;
                            if (b) {
                                s6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                            }
                            else {
                                s6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                            }
                            int1 = ((BaseBundle)bundle).getInt(s6);
                            String s7;
                            if (b) {
                                s7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                            }
                            else {
                                s7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                            }
                            final Bundle bundle2 = (Bundle)bundle.getParcelable(s7);
                            int c = n;
                            if (uri != null) {
                                c = n;
                                if (clipDescription != null) {
                                    c = (a.c(new sqd(uri, clipDescription, uri2), int1, bundle2) ? 1 : 0);
                                }
                            }
                            int1 = c;
                            if (resultReceiver != null) {
                                resultReceiver.send(c, (Bundle)null);
                                int1 = c;
                                return int1 != 0 || super.performPrivateCommand(s, bundle);
                            }
                            return int1 != 0 || super.performPrivateCommand(s, bundle);
                        }
                        finally {}
                    }
                    finally {
                        bundle = null;
                    }
                    if (bundle != null) {
                        ((ResultReceiver)bundle).send(0, (Bundle)null);
                    }
                }
                return int1 != 0 || super.performPrivateCommand(s, bundle);
            }
        };
    }
    
    public interface c
    {
        boolean c(final sqd p0, final int p1, final Bundle p2);
    }
}
