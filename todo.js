const { argv} = require('node:process');

// todo application
// add todo
//complete todo
//remnove todo
//view all todo's

const handlecommand= (todocommand, todo)=>{
    switch(todocommand){
        case 'add':
            console.log(todocommand, todo);
            break;
            case 'complete':
            console.log(todocommand, todo);
            break;case 'remove':
            console.log(todocommand, todo);
            break;case 'view':
            console.log(todocommand);
            break;
        default:
            console.log('Please input a valid command');
    }
}

const init = () => {
    const todocommand = argv[2];
    const todo = argv[3];
    return handlecommand(todocommand, todo);
};

init()