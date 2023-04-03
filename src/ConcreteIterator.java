public class ConcreteIterator implements IteratorActionBase {
    private Action actions;
    private int position;
    public ConcreteIterator(Action actions){
        this.actions = actions;
        this.position = 0;
    }

    @Override
    public Object first() {
        position = 0;
        return currentItem();
    }

    @Override
    public Object next() {
        position++;
        return currentItem();
    }

    @Override
    public Object currentItem() {
        if (position < actions.count()) {
            return actions.get(position);
        }
        else {
            return null;
        }
    }
    @Override
    public boolean isDone() {
        return position >= actions.count();
    }
}
