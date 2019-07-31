package tech.mbsoft.customrecyclerview.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.h6ah4i.android.widget.advrecyclerview.draggable.ItemDraggableRange;
import com.h6ah4i.android.widget.advrecyclerview.expandable.ExpandableDraggableItemAdapter;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemAdapter;

public class ExpandapleRVAdapter
        extends AbstractExpandableItemAdapter<CustomRecyclerViewAdapter.CustomRecyclerViewHolder,CustomRecyclerViewAdapter.CustomRecyclerViewHolder>
        implements ExpandableDraggableItemAdapter<CustomRecyclerViewAdapter.CustomRecyclerViewHolder, CustomRecyclerViewAdapter.CustomRecyclerViewHolder> {


    @Override
    public boolean onCheckGroupCanStartDrag(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int x, int y) {
        return false;
    }

    @Override
    public boolean onCheckChildCanStartDrag(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int childPosition, int x, int y) {
        return false;
    }

    @Override
    public ItemDraggableRange onGetGroupItemDraggableRange(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition) {
        return null;
    }

    @Override
    public ItemDraggableRange onGetChildItemDraggableRange(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public void onMoveGroupItem(int fromGroupPosition, int toGroupPosition) {

    }

    @Override
    public void onMoveChildItem(int fromGroupPosition, int fromChildPosition, int toGroupPosition, int toChildPosition) {

    }

    @Override
    public boolean onCheckGroupCanDrop(int draggingGroupPosition, int dropGroupPosition) {
        return false;
    }

    @Override
    public boolean onCheckChildCanDrop(int draggingGroupPosition, int draggingChildPosition, int dropGroupPosition, int dropChildPosition) {
        return false;
    }

    @Override
    public void onGroupDragStarted(int groupPosition) {

    }

    @Override
    public void onChildDragStarted(int groupPosition, int childPosition) {

    }

    @Override
    public void onGroupDragFinished(int fromGroupPosition, int toGroupPosition, boolean result) {

    }

    @Override
    public void onChildDragFinished(int fromGroupPosition, int fromChildPosition, int toGroupPosition, int toChildPosition, boolean result) {

    }

    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildCount(int groupPosition) {
        return 0;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @NonNull
    @Override
    public CustomRecyclerViewAdapter.CustomRecyclerViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @NonNull
    @Override
    public CustomRecyclerViewAdapter.CustomRecyclerViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindGroupViewHolder(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int viewType) {

    }

    @Override
    public void onBindChildViewHolder(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int childPosition, int viewType) {

    }

    @Override
    public boolean onCheckCanExpandOrCollapseGroup(@NonNull CustomRecyclerViewAdapter.CustomRecyclerViewHolder holder, int groupPosition, int x, int y, boolean expand) {
        return false;
    }
}
