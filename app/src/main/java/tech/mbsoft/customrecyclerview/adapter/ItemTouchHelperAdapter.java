package tech.mbsoft.customrecyclerview.adapter;

public interface ItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);

}
