//Author: Chan Yew Whye Ernest
//For NUS Fintech Society Recruitment 2021

pragma solidity 0.5.1;

contract Bribe {
    bool public vacancy = true;
    address payable wallet; //Represents the wallet of NUS Fintech
    address public personWhoGotIn; //defualt address if still vacant
    
    modifier vacant() {
        require (vacancy == true); //Modifier to keep track of vacancy
        _;
    }
    
    constructor(address payable _wallet) public {
        wallet = _wallet; //Initialises Fintech society's wallet (Enter Acc ID when deploying)
    }
    
    function applyToBlockchainDepartment() public payable vacant returns(string memory) {
        require (msg.value >= 1 ether);
        personWhoGotIn = msg.sender;
        wallet.transfer(msg.value);
        vacancy = false;
        return "I got into Blockchain Department of Fintech Society";
    }
    
    //Assumption: Fintech society does not fill up their own place :P (send themselves ether)
}