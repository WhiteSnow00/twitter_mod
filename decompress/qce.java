import com.twitter.nft.walletconnect.JsHandler;
import android.webkit.ConsoleMessage$MessageLevel;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qce extends WebChromeClient
{
    public final boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        zzd.f((Object)consoleMessage, "message");
        boolean b;
        if (consoleMessage.messageLevel() == ConsoleMessage$MessageLevel.ERROR) {
            final String message = consoleMessage.message();
            final int lineNumber = consoleMessage.lineNumber();
            final String sourceId = consoleMessage.sourceId();
            final StringBuilder sb = new StringBuilder();
            sb.append(message);
            sb.append(" -- From line ");
            sb.append(lineNumber);
            sb.append(" of ");
            sb.append(sourceId);
            JsHandler.b.onNext((Object)new pce$a(sb.toString()));
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
