import android.content.ClipData;
import android.view.View;
import android.os.Build$VERSION;
import android.text.Selection;
import android.text.Spannable;
import android.app.Activity;
import android.widget.TextView;
import android.view.DragEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ok0
{
    public static boolean a(final DragEvent dragEvent, final TextView textView, final Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        final int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable)textView.getText(), offsetForPosition);
            final ClipData clipData = dragEvent.getClipData();
            Object o;
            if (Build$VERSION.SDK_INT >= 31) {
                o = new pm6$a(clipData, 3);
            }
            else {
                o = new pm6$c(clipData, 3);
            }
            b7x.u((View)textView, ((pm6.b)o).b());
            return true;
        }
        finally {
            textView.endBatchEdit();
        }
    }
    
    public static boolean b(final DragEvent dragEvent, final View view, final Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        final ClipData clipData = dragEvent.getClipData();
        Object o;
        if (Build$VERSION.SDK_INT >= 31) {
            o = new pm6$a(clipData, 3);
        }
        else {
            o = new pm6$c(clipData, 3);
        }
        b7x.u(view, ((pm6.b)o).b());
        return true;
    }
}
