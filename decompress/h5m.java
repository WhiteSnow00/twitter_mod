import java.util.Objects;
import android.util.Log;
import android.os.Handler;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.text.TextUtils;
import android.view.inputmethod.CorrectionInfo;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.CompletionInfo;
import android.view.KeyEvent;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.view.inputmethod.InputConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h5m implements InputConnection
{
    public final qrd a;
    public final boolean b;
    public int c;
    public fhs d;
    public int e;
    public boolean f;
    public final List<hr9> g;
    public boolean h;
    
    public h5m(final fhs d, final qrd a, final boolean b) {
        zzd.f((Object)d, "initState");
        this.a = a;
        this.b = b;
        this.d = d;
        this.g = new ArrayList();
        this.h = true;
    }
    
    public final void a(final hr9 hr9) {
        ++this.c;
        try {
            this.g.add(hr9);
        }
        finally {
            this.b();
        }
    }
    
    public final boolean b() {
        final int c = this.c - 1;
        this.c = c;
        boolean b = true;
        if (c == 0 && (this.g.isEmpty() ^ true)) {
            this.a.d(or4.p2((Collection)this.g));
            this.g.clear();
        }
        if (this.c <= 0) {
            b = false;
        }
        return b;
    }
    
    public final boolean beginBatchEdit() {
        final boolean h = this.h;
        if (h) {
            ++this.c;
            return true;
        }
        return h;
    }
    
    public final void c(final int n) {
        this.sendKeyEvent(new KeyEvent(0, n));
        this.sendKeyEvent(new KeyEvent(1, n));
    }
    
    public final boolean clearMetaKeyStates(final int n) {
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.a(this);
    }
    
    public final boolean commitCompletion(final CompletionInfo completionInfo) {
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
        zzd.f((Object)inputContentInfo, "inputContentInfo");
        boolean h;
        if (h = this.h) {
            h = false;
        }
        return h;
    }
    
    public final boolean commitCorrection(final CorrectionInfo correctionInfo) {
        boolean b;
        if (b = this.h) {
            b = this.b;
        }
        return b;
    }
    
    public final boolean commitText(final CharSequence charSequence, final int n) {
        final boolean h = this.h;
        if (h) {
            this.a((hr9)new kx4(String.valueOf(charSequence), n));
        }
        return h;
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a((hr9)new uo8(n, n2));
            return true;
        }
        return h;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new vo8(n, n2));
            return true;
        }
        return h;
    }
    
    public final boolean endBatchEdit() {
        return this.b();
    }
    
    public final boolean finishComposingText() {
        boolean h;
        if (h = this.h) {
            this.a((hr9)new v0b());
            h = true;
        }
        return h;
    }
    
    public final int getCursorCapsMode(final int n) {
        final fhs d = this.d;
        return TextUtils.getCapsMode((CharSequence)d.a.C0, mis.g(d.b), n);
    }
    
    public final ExtractedText getExtractedText(final ExtractedTextRequest extractedTextRequest, int token) {
        boolean f = true;
        final int n = 0;
        if ((token & 0x1) == 0x0) {
            f = false;
        }
        this.f = f;
        if (f) {
            token = n;
            if (extractedTextRequest != null) {
                token = extractedTextRequest.token;
            }
            this.e = token;
        }
        return lr0.R(this.d);
    }
    
    public final Handler getHandler() {
        return null;
    }
    
    public final CharSequence getSelectedText(final int n) {
        CharSequence c0;
        if (mis.c(this.d.b)) {
            c0 = null;
        }
        else {
            c0 = asy.N(this.d).C0;
        }
        return c0;
    }
    
    public final CharSequence getTextAfterCursor(final int n, final int n2) {
        return asy.Q(this.d, n).C0;
    }
    
    public final CharSequence getTextBeforeCursor(final int n, final int n2) {
        return asy.R(this.d, n).C0;
    }
    
    public final boolean performContextMenuAction(final int n) {
        boolean h;
        if (h = this.h) {
            h = false;
            switch (n) {
                case 16908322: {
                    this.c(279);
                    break;
                }
                case 16908321: {
                    this.c(278);
                    break;
                }
                case 16908320: {
                    this.c(277);
                    break;
                }
                case 16908319: {
                    this.a((hr9)new tmp(0, this.d.a.C0.length()));
                    break;
                }
            }
        }
        return h;
    }
    
    public final boolean performEditorAction(int n) {
        boolean h;
        if (h = this.h) {
            h = true;
            Label_0184: {
                if (n != 0) {
                    switch (n) {
                        default: {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("IME sends unsupported Editor Action: ");
                            sb.append(n);
                            Log.w("RecordingIC", sb.toString());
                            Objects.requireNonNull(u9d.Companion);
                            break;
                        }
                        case 7: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 5;
                            break Label_0184;
                        }
                        case 6: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 7;
                            break Label_0184;
                        }
                        case 5: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 6;
                            break Label_0184;
                        }
                        case 4: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 4;
                            break Label_0184;
                        }
                        case 3: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 3;
                            break Label_0184;
                        }
                        case 2: {
                            Objects.requireNonNull(u9d.Companion);
                            n = 2;
                            break Label_0184;
                        }
                    }
                }
                else {
                    Objects.requireNonNull(u9d.Companion);
                }
                n = 1;
            }
            this.a.c(n);
        }
        return h;
    }
    
    public final boolean performPrivateCommand(final String s, final Bundle bundle) {
        boolean h;
        if (h = this.h) {
            h = true;
        }
        return h;
    }
    
    public final boolean reportFullscreenMode(final boolean b) {
        return false;
    }
    
    public final boolean requestCursorUpdates(final int n) {
        boolean h;
        if (h = this.h) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
            h = false;
        }
        return h;
    }
    
    public final boolean sendKeyEvent(final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        final boolean h = this.h;
        if (h) {
            this.a.b(keyEvent);
            return true;
        }
        return h;
    }
    
    public final boolean setComposingRegion(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a(new pmp(n, n2));
        }
        return h;
    }
    
    public final boolean setComposingText(final CharSequence charSequence, final int n) {
        final boolean h = this.h;
        if (h) {
            this.a((hr9)new qmp(String.valueOf(charSequence), n));
        }
        return h;
    }
    
    public final boolean setSelection(final int n, final int n2) {
        final boolean h = this.h;
        if (h) {
            this.a((hr9)new tmp(n, n2));
            return true;
        }
        return h;
    }
}
